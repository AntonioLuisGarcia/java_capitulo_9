package FileSystem;

/** clase Folder
 * Hereda de la clase File e implementa la interfaz FolderEntry
 * La clase Folder mantiene una lista de archivos/carpetas así como una referencia
 * a la carpeta que la contiene
 * La clase Folder al heredar de la clase File hereda sus propiedades
 * name, level y createdAt
 * Además dispondrá de un array donde se irán añadiendo los archivos que están dentro de
 * la carpeta
 * Debe implementar la interfaz FolderEntry
 * Debe tener un constructor que recibirá la carpeta que la contiene, en el caso
 * de que sea la carpeta raiz, recibirá null en la referencia a la carpeta padre
 * Además el constructor recibirá el nombre de la carpeta así como el nivel en el que se
 * encuentra la carpeta (Nivel 0 es la carpeta raiz, Nivel 1 las carpetas hijas de la carpeta raiz,
 * y así sucesivamente)
 * Ejemplo de llamada al constructor:
 * Folder root = new Folder(null, "Raiz", 0);
 * 
 */

 class Folder extends File implements FolderEntry{

    private String folderName;
    private File[] arrayFiles = new File[100];
    private int numeroDeArchivosDentro;


    public Folder(String fileName,String folderName, int nivel) {
        super(fileName, nivel);
        this.folderName = folderName;
        numeroDeArchivosDentro = 0;
    }

    
    @Override
    public Folder getParent() {
        if(this.nivel == 0){
            return null;
        }else{

            //busco un archivo que tenga un nivel menos y que contengan a este archivo que llama a la funcion

            return null;
        }

    }

    @Override
    public boolean isFolderFull() {

        if(numeroDeArchivosDentro == 100){
            return true;
        }
        return false;
    }

    @Override
    public int getFileCount() {
 
        return this.numeroDeArchivosDentro;
    }

    @Override
    public boolean isFileInFolder(String fileName) {

        for(int i = 0 ; i < numeroDeArchivosDentro ; i++){
            if(arrayFiles[i].getName().equals(fileName)){
                return true;
            }
        }

        return false;
    }

    //esta funcion me sirve para devolver la posicion de un folder que nos pidan por su nombre
    public int positionFolder(String fileName) {

        for(int i = 0 ; i < numeroDeArchivosDentro ; i++){
            if(arrayFiles[i].getName().equals(fileName)){
                return i;
            }
        }

        //aqui nunca deberia de llegar nunca porque ya se ha hecho la comprobacion el la funcion que lo ha llamado
        return -1;
    }

    @Override
    public Folder addFolder(String folderName) throws FolderIsFullException, FileAlreadyExistsException {
        
        if(this.isFileInFolder(folderName)){

            throw new FileAlreadyExistsException();
        }
        
        if(this.isFolderFull()){

            throw new FolderIsFullException();
        }


        this.arrayFiles[numeroDeArchivosDentro] = new Folder(this.folderName, folderName, this.nivel+1);

        this.numeroDeArchivosDentro++;

        return (Folder) arrayFiles[this.numeroDeArchivosDentro-1];
    }
    
    @Override
    public File addFile(String fileName) throws FolderIsFullException, FileAlreadyExistsException {

        if(this.isFileInFolder(folderName)){

            throw new FileAlreadyExistsException();
        }

        if(this.isFolderFull()){

            throw new FolderIsFullException();
        }


        this.arrayFiles[numeroDeArchivosDentro] = new File(fileName,this.nivel+1);

        this.numeroDeArchivosDentro++;

        return (File) arrayFiles[this.numeroDeArchivosDentro-1];
    }
    
    @Override/////
    public File removeFile(String fileName) throws FileDoesNotExistsException {

        if(!this.isFileInFolder(folderName)){
            throw new FileDoesNotExistsException();
        }
        
        for(int i = 0 ; i < numeroDeArchivosDentro ; i++){
            if(arrayFiles[i].getName().equals(fileName)){
                arrayFiles[i] = null;
                return arrayFiles[i];
            }
        }

        return null;
    }
    
    @Override//////
    public File removeFolder(String folderName, boolean recursive) throws FileDoesNotExistsException, FolderIsNotEmptyException {

        if(!this.isFileInFolder(folderName)){
            throw new FileDoesNotExistsException();
        }

        if(this.getFileCount()>0){
            throw new FolderIsNotEmptyException();
        }

        for(int i = 0 ; i < numeroDeArchivosDentro ; i++){
            if(arrayFiles[i].getName().equals(folderName)){
                arrayFiles[i] = null;
                return arrayFiles[i];
            }
        }

        return null;
    }
    
    @Override
    public Folder getFolder(String folderName) throws FileDoesNotExistsException {

        if(!isFileInFolder(folderName)){
            throw new FileDoesNotExistsException();
        }else{
            int position = this.positionFolder(folderName);
            return (Folder) this.arrayFiles[position];
        }
    }

    @Override
    public boolean isDirectory(){
        return true;
    }
    
    @Override
    public String toString(){
        String texto = "";
        
        for(int i = 1 ; i <= this.nivel ; i++){
            texto += " ";
        }

        texto = "|_[" + this.folderName + "]\n";

        for(int j = 0 ; j < this.getFileCount() ; j++){
           
            for(int i = 1 ; i <= this.nivel ; i++){
                texto += " ";
            }

            texto += "|_[" + this.arrayFiles[j] + "]\n";

        }

        return texto;
    }
}
