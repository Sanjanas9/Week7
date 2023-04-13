import java.util.HashMap;
class Map{
  public static void main(String args[]){
    HashMap<Integer,String>map=new HashMap<Integer,String>();
    map.put(101,"sanjana");
    map.put(102,"anjana");
    map.put(103,"njana");
    map.IfAbsent(104,jana);
     System.out.println(map);
    for(Map.Entry m:map.entrySet()){
      System.out.println(m.getKey+" "+m.getValue());
    }
  }
}