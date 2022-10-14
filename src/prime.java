import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class prime {
    private double p[];
    private double x;
    private int count;
    private int length;
    private int l;

    public prime(int y){
        File file = new File("primeNumbers.txt");
        try {
            if(file.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        l = 100000;
        l = y;
        p = new double[l];
        length = 1;
        for(int i=0;i<l;i++){
            p[i] = 2;
        }
        count = 0;
        x = 3;
    for(double i=0;i<l;i++){
        if(i == 0){
            System.out.println("Calculating all prime numbers until: " + l);
            try {
                writer.write("Prime Numbers until: " + l + "\n" + "\n");
                writer.write(2 + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
            prime();
            if(count == 0){
                p[length] = x;
                //System.out.println(x + " is a prime number");
                try {
                    writer.write((int)x + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                length = length +1;
            }
            count = 0;
            x= x+1;
            if(i==l*0.1){
                System.out.println("10%");
            }
            if(i==l*0.2){
                System.out.println("20%");
            }
            if(i==l*0.3){
                System.out.println("30%");
            }
            if(i==l*0.4){
                System.out.println("40%");
            }
            if(i==l*0.5){
                System.out.println("50%");
            }
            if(i == l * 0.6){
                System.out.println("60%");
            }
            if(i == l * 0.7){
                System.out.println("70%");
            }
            if(i == l * 0.8){
                System.out.println("80%");
            }
            if(i == l * 0.9){
                System.out.println("90%");
            }
            if(i == l-1){
                System.out.println("100%");
                System.out.println("Complete! File can be found as primeNumbers.txt in the root directory of this software.");
            }

        }
        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void prime(){
        for(int i=1;i<p.length;i++){
            if(x/p[i]==Math.floor(x/p[i])){
                count = count +1;
            }
        }
    }
}
