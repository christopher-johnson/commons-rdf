module org.apache.commons.rdf.jena {
    provides org.apache.commons.rdf.api.RDF with org.apache.commons.rdf.jena.JenaRDF;
    requires org.apache.commons.rdf.api;
    requires org.apache.jena.core;
    requires org.apache.jena.arq;
    requires org.apache.jena.base;
    exports org.apache.commons.rdf.jena;
}