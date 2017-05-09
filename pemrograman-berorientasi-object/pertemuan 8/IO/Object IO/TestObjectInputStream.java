import java.io.*;
class TestObjectInputStream {
  public static void main(String[] args) throws ClassNotFoundException,IOException{
    File inFile = new File("object.dat");
    FileInputStream inFileStream =new FileInputStream(inFile);
    ObjectInputStream inObjectStream = new ObjectInputStream(inFileStream);

    Person person;
    for (int i=0;i<10;i++) {
      person = (Person) inObjectStream.readObject();
      System.out.println(person.getName()+" "+person.getAge()+" "+person.getGender());
    }
    inObjectStream.close();
  }
}
