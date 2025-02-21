package singleton.clas;

public class TableData {
	//enthusiatic initialization
   private static TableData td = new TableData();
   
   public static TableData getTableData() {
	   if(td==null) {
		   td=new TableData();
	   }
	   return td;
   }
   private TableData() {
	   
   }
}
