public class RegistroLista {
    private int codigo;
    private String departamento;
    private int municipio;
    private String cabecera;
    private String region;

    public RegistroLista(int codigo, String departamento, int municipio, String cabecera, String region) {
        this.codigo = codigo;
        this.departamento = departamento;
        this.municipio = municipio;
        this.cabecera = cabecera;
        this.region = region;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getMunicipio() {
        return municipio;
    }

    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }

    public String getCabecera() {
        return cabecera;
    }

    public void setCabecera(String cabecera) {
        this.cabecera = cabecera;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "\nRegistro{" +
                "\nCodigo= " + codigo +
                ", \nDepartamento= '" + departamento + '\'' +
                ", \nMunicipios= " + municipio +
                ", \nCabecera= '" + cabecera + '\'' +
                ", \nRegion= '" + region + '\'' +
                '}' + "\n";
    }
}
