package eva2_4_formato_apa;

public class EVA2_4_FORMATO_APA {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro lib = new Libro();
        lib.setAutor("Juan Perez");        
        lib.setVolumen(3);
        lib.setTitulo("La decadencia del libro");
        lib.setEditorial("Trias");
        lib.setDia(23);
        lib.setMes("Diciembre");
        lib.setAño(2008);
        lib.setCiudad("Chihuahua");        
        System.out.println("Libro APA: ");
        System.out.println("Autor: "+lib.getAutor());
        System.out.println("Titulo: "+lib.getTitulo());
        System.out.println("Volumen: "+lib.getVolumen());
        System.out.println("Editorial: "+lib.getEditorial());
        System.out.println("Dia: "+lib.getDia());
        System.out.println("Mes: "+lib.getMes());
        System.out.println("Año: "+lib.getAño());
        System.out.println("Ciudad: "+lib.getCiudad());
        
        System.out.println("");
        
        Articulo art = new Articulo();
        art.setAutor("Jesus Miranda");        
        art.setPaginas(3);
        art.setTitulo("La decadencia de los articulos");
        art.setMedio("Periodico");
        art.setDia(24);
        art.setMes("Mayo");
        art.setAño(2016);
        art.setCiudad("Chihuahua");   
        System.out.println("Articulo APA: ");
        System.out.println("Autor: "+art.getAutor());
        System.out.println("Titulo: "+art.getTitulo());
        System.out.println("Paginas: "+art.getPaginas());
        System.out.println("Medio: "+art.getMedio());
        System.out.println("Dia: "+art.getDia());
        System.out.println("Mes: "+art.getMes());
        System.out.println("Año: "+art.getAño());
        System.out.println("Ciudad: "+art.getCiudad());
        
        System.out.println("");
        
        Informe inf = new Informe();
        inf.setAutor("Joseph Joestar");        
        inf.setTipoDeInforme("Tesis");
        inf.setTitulo("El hotdog es mas un sandwich o un burrito?");
        inf.setInstitucion("ITCH II");
        inf.setDia(28);
        inf.setMes("Marzo");
        inf.setAño(2022);
        inf.setCiudad("Chihuahua");   
        System.out.println("Informe APA: ");
        System.out.println("Autor: "+inf.getAutor());
        System.out.println("Titulo: "+inf.getTitulo());
        System.out.println("Tipo de informe: "+inf.getTipoDeInforme());
        System.out.println("Institucion: "+inf.getInstitucion());
        System.out.println("Dia: "+inf.getDia());
        System.out.println("Mes: "+inf.getMes());
        System.out.println("Año: "+inf.getAño());
        System.out.println("Ciudad: "+inf.getCiudad());
        
        System.out.println("");
        
        SitioWeb sw = new SitioWeb();
        sw.setAutor("Mario Bros");        
        sw.setNombreSitioWeb("Github");
        sw.setTitulo("¿Como centrar un div?");
        sw.setUrl("https://Github.com/centrar-un-div");
        sw.setDia(9);
        sw.setMes("Marzo");
        sw.setAño(2023);
        sw.setCiudad("Chihuahua");   
        System.out.println("Sitio Web APA: ");
        System.out.println("Autor: "+sw.getAutor());
        System.out.println("Titulo: "+sw.getTitulo());
        System.out.println("Nombre del sitio web: "+sw.getNombreSitioWeb());
        System.out.println("URL: "+sw.getUrl());
        System.out.println("Dia: "+sw.getDia());
        System.out.println("Mes: "+sw.getMes());
        System.out.println("Año: "+sw.getAño());
        System.out.println("Ciudad: "+sw.getCiudad());
        
        
    }
    
}
