package singleton.clas;

public class Mainclass2 {
 public static void main(String[] args) {
	TableData t1= TableData.getTableData();
    TableData t2 = TableData.getTableData()	;
    System.out.println(t1);
    System.out.println(t2);
 }
}
