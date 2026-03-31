
interface Exporter{
	void export();
	default void exportToJSON(){
		System.out.println("Exported to JSON");
	}
}
class CSVExporter implements Exporter{
	public void export(){
		System.out.println("Exported to CSV");
	}
}
class PDFExporter implements Exporter{
	public void export(){
		System.out.println("Exported to PDF");
	}
}
public class DataExportFeature{
	public static void main(String[] args){
		Exporter e1=new CSVExporter();
		Exporter e2=new PDFExporter();
		e1.export();
		e1.exportToJSON();
		e2.export();
		e2.exportToJSON();
	}
}
