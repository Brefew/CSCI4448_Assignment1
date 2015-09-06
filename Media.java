abstract class Media implements Comparable<Media>
{
	private int sortKey;
	
    protected String title;
	public String getTitle()  { return title; }
	
	public String getSortKey() {
		return Integer.toString(sortKey);
	}
	
}
