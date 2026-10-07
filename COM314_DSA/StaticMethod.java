public class StaticMethod{
public static<T> void print(T[] array){
for(T elem : array) // for-each loop (read only)
System.out.println(elem);

}
public static void main(String[] args){
String[] names = {"john", "mary", "peter", "Chitukula"};
String[] letters = {"d", "qq"};
print(names);
print(letters);
}
}