/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uga.miashs.sempic.rdf;

import fr.uga.miashs.sempic.model.rdf.Projet;
import fr.uga.miashs.sempic.model.rdf.SempicOnto;
import java.util.List;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
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
        Resource pRes = s.createPhoto(1, 1, 1);
        Resource newMedor = m.createResource(Projet.dog);
        newMedor.addLiteral(RDFS.label, "Medor");
        m.add(pRes, Projet.Subject, newMedor);
        Resource newPatrick = m.createResource(Projet.Male);
        newPatrick.addLiteral(RDFS.label, "Patrick");
        m.add(pRes, Projet.Subject, newPatrick);
        Resource newPierre = m.createResource(Projet.Male);
        newPierre.addLiteral(RDFS.label, "Pierre");
        m.add(pRes, Projet.Author, newPierre);
        Resource newGrenoble = m.createResource(Projet.City);
        newGrenoble.addLiteral(RDFS.label, "Grenoble");
        m.add(pRes, Projet.Where, newGrenoble);
        
        // Photo 2 : Description -> 2 hommes + 2 chevaux à la plage, prise par Pierre à l'île Maurice
        Resource pRes2 = s.createPhoto(2, 1, 1);
        Resource newHorse1 = m.createResource(Projet.horse);
        Resource newHorse2 = m.createResource(Projet.horse);
        Resource newAnonymous1 = m.createResource(Projet.People);
        Resource newAnonymous2 = m.createResource(Projet.People);
        Resource newPlaceBeach = m.createResource(Projet.Beach);
        
        m.add(pRes2, Projet.Subject, newHorse1);
        m.add(pRes2, Projet.Subject, newHorse2);
        m.add(pRes2, Projet.Subject, newAnonymous1);
        m.add(pRes2, Projet.Subject, newAnonymous2);
        m.add(newAnonymous1, Projet.isFriendOf, newAnonymous2);
        m.add(pRes2, Projet.Where, newPlaceBeach);
        m.add(pRes2, Projet.Author, newPierre);
       
        // Photo 3 : Description -> Photo de Félix le chat, prise par Pierre à Grenoble
        Resource pRes3 = s.createPhoto(3, 1, 1);
        
        Resource newFelix = m.createResource(Projet.cat);
        
        m.add(pRes3, Projet.Subject, newFelix);
        m.add(pRes3, Projet.Where, newGrenoble);
        m.add(pRes3, Projet.Author, newPierre);
        
        
        
        // Album 2, de l'owner 1
        // Photo 1 : Descrption -> Une autruche dans la savanne
        Resource pRes4 = s.createPhoto(4, 2, 1);
        
        Resource newOstrich = m.createResource(Projet.Country);
        Resource newSavanna = m.createResource(Projet.Landscape);
        
        m.add(pRes4, Projet.Subject, newOstrich);
        m.add(pRes4, Projet.Where, newSavanna);
        m.add(pRes4, Projet.Author, newPierre);
        
        // Photo 2 : Description ->
        Resource pRes5 = s.createPhoto(5, 2, 1);
        Resource newMountain = m.createResource (Projet.Mountain);
       
        m.add(pRes5, Projet.Where, newMountain);
        m.add(pRes5, Projet.Author, newPierre);
        
        // Photo 3 : Description ->
        Resource pRes6 = s.createPhoto(6, 2, 1);
        Resource newHollidays = m.createResource (Projet.Holidays);
        Resource newBeach = m.createResource(Projet.Area);
        m.add(pRes5, Projet.Event, newHollidays);
        m.add(pRes5, Projet.Where, newBeach);
        m.add(pRes5, Projet.Author, newPierre);
        
        // Album 3, de l'owner 2
        // Photo 1 : Description -> Pendaison de crémaillère avec Elisa, Marcella, Sophia et Lucas
        Resource pRes7 = s.createPhoto(7, 3, 2);
        
        Resource newElisa = m.createResource(Projet.Female);
        Resource newMarcella = m.createResource(Projet.Female);
        Resource newSophia = m.createResource(Projet.Female);
        Resource newLucas = m.createResource(Projet.Male);
        newElisa.addLiteral(RDFS.label, "Elisa");
        newMarcella.addLiteral(RDFS.label, "Marcella");
        newSophia.addLiteral(RDFS.label, "Sophia");
        newLucas.addLiteral(RDFS.label, "Lucas");
        m.add(newElisa, Projet.isFriendOf, newMarcella);
        m.add(newElisa, Projet.isFriendOf, newSophia);
        m.add(newElisa, Projet.isFriendOf, newLucas);
        m.add(newMarcella, Projet.isFriendOf, newSophia);
        m.add(newMarcella, Projet.isFriendOf, newLucas);
        m.add(newLucas, Projet.isFriendOf, newSophia);
        Resource newParty = m.createResource(Projet.Party);
        
        m.add(pRes7, Projet.Subject, newElisa);
        m.add(pRes7, Projet.Subject, newMarcella);
        m.add(pRes7, Projet.Subject, newSophia);
        m.add(pRes7, Projet.Subject, newLucas);
        m.add(pRes7, Projet.Author, newElisa);
        
        // Photo 2 -> Description : Lucie, Emilie et Suzie jouent aux jeux vidéos
        Resource pRes8 = s.createPhoto(8, 3, 2);
        
        Resource newLucie = m.createResource(Projet.Female);
        newLucie.addLiteral(RDFS.label, "Lucie");
        Resource newEmilie = m.createResource(Projet.Female);
        newEmilie.addLiteral(RDFS.label, "Emilie");
        Resource newSuzie = m.createResource(Projet.Female);
        newSuzie.addLiteral(RDFS.label, "Suzie");
        
        m.add(pRes8, Projet.Subject, newLucie);
        m.add(pRes8, Projet.Subject, newEmilie);
        m.add(pRes8, Projet.Subject, newSuzie);
                
        m.add(pRes8, Projet.Author, newElisa);
        
        // Photo 3 -> Description :  Madeleine et sa maman Elisa
        Resource pRes9 = s.createPhoto(9, 3, 2);
        
        Resource newMadeleine = m.createResource(Projet.Female);
        newMadeleine.addLiteral(RDFS.label, "Madeleine");
        
        m.add(pRes8, Projet.Subject, newMadeleine);
        m.add(pRes8, Projet.Subject, newElisa);
        m.add(newMadeleine, Projet.hasParent, newElisa);
        
        m.add(pRes7, Projet.Author, newElisa);
        
        
        // Photo 4 : Description -> Deux amis d'Elis jouent à un jeu de plateau
        Resource pRes10 = s.createPhoto(10, 3, 2);
        
        Resource newSam = m.createResource(Projet.Male);
        newSam.addLiteral(RDFS.label, "Sam");
        Resource newElisabeth = m.createResource (Projet.Female);
        newElisabeth.addLiteral(RDFS.label, "Elisabeth");
        
        m.add(pRes9, Projet.Subject, newSam);
        m.add(pRes8, Projet.Subject, newElisabeth);
            m.add(newElisa, Projet.isFriendOf, newSam);
            m.add(newElisa, Projet.isFriendOf, newElisabeth);
            m.add(newSam, Projet.isFriendOf, newElisabeth);
        m.add(pRes7, Projet.Author, newElisa);
        
        
        m.write(System.out, "turtle");
     }
}
