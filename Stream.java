import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
  * MthodStatic
  */
 public class Stream {
    public static void main(String[] args) {

        
    
    
    List<Integer> l1= Arrays.asList(2,4,5,7,8,10);
    List<String> l2=Arrays.asList("apple","banana","apple","cheery","banana");



    List<Integer> li1=(List<Integer>) l1.stream().sorted().filter(x->x%2==0).skip(2).collect(Collectors.toList());
 // li1.limit(1).foreach(System.out::println);

    List <String> li2=(List<String>)l2.stream().filter(x->x.startsWith("c")).collect(Collectors.toList());
    List <String> li3=(List<String>)l2.stream().sorted().collect(Collectors.toList());
   
    List<Integer> li4= (List<Integer>)l1.stream().map(x->x*x).collect(Collectors.toList());
    List <String> li5=(List<String>)l2.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
    List <String> li7=(List<String>)l2.stream().distinct().sorted().collect(Collectors.toList());

    



    System.out.println(li1);
    System.out.println(li2);
    System.out.println(li3);
    System.out.println(li4);
    System.out.println(li5);
    System.out.println(li7);

}}