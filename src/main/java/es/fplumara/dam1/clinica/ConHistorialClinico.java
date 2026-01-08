package es.fplumara.dam1.clinica;

interface ConHistorialClinico {
    void anotarRevision (String fecha, String descripcion);
    int numeroRevisiones ();
}
