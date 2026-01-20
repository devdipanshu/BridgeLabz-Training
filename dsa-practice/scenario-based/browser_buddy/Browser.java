package browser_buddy;

public class Browser {
	TabHistory activeTab = new TabHistory();
	ClosedTabStack closedTabs = new ClosedTabStack();

	public void open(String url){
		activeTab.visit(url);
	}

	public void back(){
		activeTab.back();
	}

	public void forward(){
		activeTab.forward();
	}

	public void closeTab(){
		closedTabs.close(activeTab);
		activeTab = new TabHistory();
	}

	public void reopenTab(){
		TabHistory tab = closedTabs.reopen();
		if(tab != null){
			activeTab = tab;
		}
	}

	public void show(){
		System.out.println(activeTab.getCurrent());
	}
}
