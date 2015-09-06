class DVD extends Media
{
	int sortKey = 10;
	
    private int year;
    public DVD(String title, int year)
    {
        this.title = title;
        this.year = year;
    }
	public int getYear() 	 { return year;  }
    public String toString()
    {
        return year + ": " + title + " [DVD]";
	}
	
	public int compareTo(Media media) {
		if (media instanceof DVD) {
			DVD d = (DVD)this;
			DVD d2 = (DVD)media;
			if((d.getTitle()).compareTo(d2.getTitle()) > 0) {
				return 1;
			}
			else if ((d.getTitle()).compareTo(d2.getTitle()) > 0) {
				return (d.getYear() - d2.getYear());
			}
			else {
				return -1;
			}
		}
		else {
			return (this.getSortKey()).compareTo(media.getSortKey());
		}
	}
}
