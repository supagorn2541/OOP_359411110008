package Lap8_2;

public class personApps {

    public static void main(String[] args) {
        //create objects
        //object as a person
        person P1=new person("supagorn tongduk","1998");
        //object as a Police
        person P2=new Police("toungrut mingkham","1999","Nakhonsrithammarat");
        person P3=new Sheriff("Yanisa","1988","Thamyai");

        P1.introduce();
        P2.introduce();
        P3.introduce();
    }
}