/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uga.miashs.sempic.rdf;

import fr.uga.miashs.sempic.model.rdf.Projet;
import javax.ejb.Stateless;
import org.apache.jena.query.*;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.shared.PrefixMapping;
import org.apache.jena.vocabulary.RDFS;

/**
 *
 * @author Jerome David <jerome.david@univ-grenoble-alpes.fr>
 */

public class BasicSempicRDFStore extends RDFStore {
    
    public final PrefixMapping prefixes;

    public BasicSempicRDFStore() {
        prefixes = PrefixMapping.Factory.create();
        prefixes.withDefaultMappings(PrefixMapping.Standard);
        prefixes.setNsPrefix("sempic", Projet.NS);
    }
    
    public Resource createPhoto(long photoId, long albumId, long ownerId) {
        // create an empty RDF graph
        Model m = ModelFactory.createDefaultModel();
        // create an instance of Photo in Model m
        System.out.println(m.getResource(Namespaces.getPhotoUri(photoId)));
            Resource pRes = m.createResource(Namespaces.getPhotoUri(photoId), Projet.Picture);

            pRes.addLiteral(Projet.albumId, albumId);
            pRes.addLiteral(Projet.ownerId, ownerId);

            saveModel(m);
            System.out.println("CREATE PHOTO " + pRes);
            return pRes;
        
    }

    public void deletePhoto(long photoId) {
        // create an instance of Photo in Model m
        Resource pRes = ResourceFactory.createResource(Namespaces.getPhotoUri(photoId));
        deleteResource(pRes);
    }

    /**
     * Query a Photo and retrieve all the direct properties of the photo and if
     * the property are depic, takenIn or takenBy, it also retrieve the labels
     * of the object of these properties
     *
     * @param id
     * @return
     */
    public String readPhoto(long id) {
        String pUri = Namespaces.getPhotoUri(id);
        ParameterizedSparqlString pss = new ParameterizedSparqlString(prefixes);
        pss.setBaseUri(Namespaces.photoNS);
        
        pss.setCommandText(
                "CONSTRUCT {"
                        + "?photo ?p ?o ."
                        + "?photo ?p1 ?o1 ."
                + "} WHERE { "
                        + "?photo ?p ?o ."
                        + "OPTIONAL {"
                        + "?photo ?p1 ?o1 ."
                        + "FILTER (?p1 IN (<" + Projet.Subject + ">,<" + Projet.Where + ">,<" + Projet.Author + ">)) "
                        +"}"
                 + "}");
        pss.setIri("photo", pUri);
        
        Model m = cnx.queryConstruct(pss.asQuery());
        return m.toString();
    }
}
