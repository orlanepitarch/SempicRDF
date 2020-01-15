/* CVS $Id: $ */
package fr.uga.miashs.sempic.model.rdf; 
import org.apache.jena.rdf.model.*;
 
/**
 * Vocabulary definitions from C:\Users\Orlane\M2_Web_Semantique\SempicRDF/src/main/resources/WebSemProject.owl 
 * @author Auto-generated by schemagen on 14 janv. 2020 22:17 
 */
public class Projet {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static final Model M_MODEL = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    public static final Property Author = M_MODEL.createProperty( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Author" );
    
    public static final Property Event = M_MODEL.createProperty( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Event" );
    
    public static final Property Job = M_MODEL.createProperty( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Job" );
    
    public static final Property Location = M_MODEL.createProperty( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Location" );
    
    public static final Property Owner = M_MODEL.createProperty( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Owner" );
    
    public static final Property Pet = M_MODEL.createProperty( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Pet" );
    
    public static final Property Subject = M_MODEL.createProperty( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Subject" );
    
    public static final Property Where = M_MODEL.createProperty( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Where" );
    
    public static final Property hasFatherOf = M_MODEL.createProperty( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#hasFatherOf" );
    
    public static final Property hasMotherOf = M_MODEL.createProperty( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#hasMotherOf" );
    
    public static final Property hasParent = M_MODEL.createProperty( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#hasParent" );
    
    public static final Property isBrotherOf = M_MODEL.createProperty( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#isBrotherOf" );
    
    public static final Property isFriendOf = M_MODEL.createProperty( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#isFriendOf" );
    
    public static final Property isSisterOf = M_MODEL.createProperty( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#isSisterOf" );
    
    public static final Resource Animal = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Animal" );
    
    public static final Resource Area = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Area" );
    
    public static final Resource Beach = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Beach" );
    
    public static final Resource City = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#City" );
    
    public static final Resource Country = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Country" );
    
    public static final Resource Desert = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Desert" );
    
    public static final Resource Domestic = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Domestic" );
    
    public static final Resource Female = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Female" );
    
    public static final Resource Forest = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Forest" );
    
    public static final Resource Holidays = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Holidays" );
    
    public static final Resource Landscape = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Landscape" );
    
    public static final Resource Male = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Male" );
    
    public static final Resource Meeting = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Meeting" );
    
    public static final Resource Monument = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Monument" );
    
    public static final Resource Mountain = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Mountain" );
    
    public static final Resource Party = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Party" );
    
    public static final Resource People = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#People" );
    
    public static final Resource Picture = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Picture" );
    
    public static final Resource Place = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Place" );
    
    public static final Resource Seminar = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Seminar" );
    
    public static final Resource Wild = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Wild" );
    
    public static final Resource Work = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Work" );
    
    public static final Resource cat = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#cat" );
    
    public static final Resource cheetah = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#cheetah" );
    
    public static final Resource deer = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#deer" );
    
    public static final Resource dog = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#dog" );
    
    public static final Resource dolphin = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#dolphin" );
    
    public static final Resource duck = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#duck" );
    
    public static final Resource elephant = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#elephant" );
    
    public static final Resource fox = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#fox" );
    
    public static final Resource hamster = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#hamster" );
    
    public static final Resource hen = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#hen" );
    
    public static final Resource horse = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#horse" );
    
    public static final Resource lion = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#lion" );
    
    public static final Resource rabbit = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#rabbit" );
    
    public static final Resource Alpes = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Alpes" );
    
    public static final Resource Australia = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Australia" );
    
    public static final Resource Bastille = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Bastille" );
    
    public static final Resource Big_Ben = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Big_Ben" );
    
    public static final Resource Bondi_Beach = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Bondi_Beach" );
    
    public static final Resource Coliseum = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Coliseum" );
    
    public static final Resource Deauville = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Deauville" );
    
    public static final Resource Deauville_Beach = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Deauville_Beach" );
    
    public static final Resource Eclair = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Eclair" );
    
    public static final Resource Eiffel_Tower = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Eiffel_Tower" );
    
    public static final Resource Fiesty = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Fiesty" );
    
    public static final Resource France = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#France" );
    
    public static final Resource Germany = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Germany" );
    
    public static final Resource Grenoble = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Grenoble" );
    
    public static final Resource Italy = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Italy" );
    
    public static final Resource London = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#London" );
    
    public static final Resource Louna = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Louna" );
    
    public static final Resource Loustic = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Loustic" );
    
    public static final Resource Lyon = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Lyon" );
    
    public static final Resource Madrid = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Madrid" );
    
    public static final Resource Margaux = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Margaux" );
    
    public static final Resource Mathilde = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Mathilde" );
    
    public static final Resource Maxence = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Maxence" );
    
    public static final Resource Melissa = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Melissa" );
    
    public static final Resource Michel = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Michel" );
    
    public static final Resource Opera_House = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Opera_House" );
    
    public static final Resource Ophelie = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Ophelie" );
    
    public static final Resource Palombaggia_Beach = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Palombaggia_Beach" );
    
    public static final Resource Paris = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Paris" );
    
    public static final Resource Piccadilly_Circus = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Piccadilly_Circus" );
    
    public static final Resource Quentin = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Quentin" );
    
    public static final Resource Rome = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Rome" );
    
    public static final Resource Sahara = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Sahara" );
    
    public static final Resource Sleepy = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Sleepy" );
    
    public static final Resource Sydney = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Sydney" );
    
    public static final Resource Tom = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Tom" );
    
    public static final Resource Triumphal_Arch = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Triumphal_Arch" );
    
    public static final Resource United_Kingdom = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#United_Kingdom" );
    
    public static final Resource Vosges = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Vosges" );
    
    public static final Resource Whitehaven_Beach = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Whitehaven_Beach" );
    
    public static final Resource Yann = M_MODEL.createResource( "http://www.semanticweb.org/vivi/ontologies/2020/0/WebSemProject#Yann" );
    
}
