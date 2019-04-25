
package utspbo;

public class CPU {
    protected String nama;
    protected int kecepatan;
    
    public CPU (int kecepatan,String nama){
        this.nama=nama;
        this.kecepatan=kecepatan;
    }

    public String getCPUData() {
        return (nama + " "+kecepatan+" ");
    }
}