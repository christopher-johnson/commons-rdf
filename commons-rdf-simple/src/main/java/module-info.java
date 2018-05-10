module org.apache.commons.rdf.simple {
    provides org.apache.commons.rdf.api.RDF with org.apache.commons.rdf.simple.SimpleRDF;
    provides org.apache.commons.rdf.api.RDFTermFactory with org.apache.commons.rdf.simple.SimpleRDFTermFactory;
    requires org.apache.commons.rdf.api;
    exports org.apache.commons.rdf.simple;
}