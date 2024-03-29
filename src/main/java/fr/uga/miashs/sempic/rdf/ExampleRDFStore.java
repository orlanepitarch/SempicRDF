/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uga.miashs.sempic.rdf;

import fr.uga.miashs.sempic.model.rdf.Projet;
import java.util.List;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDFS;

/**
 *
 * @author Jerome David <jerome.david@univ-grenoble-alpes.fr>
 */
public class ExampleRDFStore {
    public static void main(String[] args) {
        BasicSempicRDFStore s = new BasicSempicRDFStore();
        Model m = ModelFactory.createDefaultModel();
        
        // Album 1, de l'owner 1
        // Photo 1 : Description -> Photo de Patrick et Medor, prise par Pierre à Grenoble
        Resource pRes = s.createPhoto(Long.parseLong("1555"), Long.parseLong("1777"), Long.parseLong("1999"));
        m.add(pRes, Projet.Subject, Projet.Margaux);
        m.add(pRes, Projet.Where, Projet.Deauville);
        
        m.write(System.out, "turtle");
        System.out.print("jjhn,kj," + m);
        s.saveModel(m);
     }
}
