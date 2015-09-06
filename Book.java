class Book extends Media
{
	int sortKey = 20;
	
    private String author;
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
	public String getAuthor() { return author; }
    public String toString()
    {
        return getTitle() + " by " + getAuthor();
	}
	
	public int compareTo(Media media) {
		if (media instanceof Book) {
			Book b = (Book)this;
			Book b2 = (Book)media;
			if((b.getTitle()).compareTo(b2.getTitle()) > 0) {
				return 1;
			}
			else if ((b.getTitle()).compareTo(b2.getTitle()) == 0) {
				return (b.getAuthor()).compareTo(b2.getAuthor());
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

