/*
Make a java class ‘Voice’. Inside this class, create a method prepareVoice(). This method 
will have an array of type ‘Animal’. The size of the array should be 5. Create five objects: 
cow, dog, pig, goat and lion, and assign them as the array elements. Make another 
method hear(). This method will contain a loop that will display different voices on your 
terminal. Make another class called ‘Test’ where you will test your system of classes. 
This means that Test will contain main method, and therefore, it will be an executable 
class.
Learning: Observe that hear method will have only one statement containing 
makeVoice(), but makeVoice() will be called for all the animals, depending upon the 
content of the reference type animal.
*/
public class Voice
{ 

 void prepareVoice(){
     Animal[] animal = new Animal[5];
     animal[0]= new Cow();
     animal[1]= new Goat();
     animal[2]= new Lion();
     animal[3]= new Dog();
     animal[4]= new Pig();
     hear(animal);
 }
 void hear(Animal[] animal){
     for (int i =0;i<5;i++)
     animal[i].makeVoice();
 }
}
