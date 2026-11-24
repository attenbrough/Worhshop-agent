public class BookCopy
{
  private final String title;
  private boolean borrowed;
  private int borrowCount;

  public BookCopy(String title)
  {
    if (title == null || title.isBlank())
    {
      throw new IllegalArgumentException("Titel må ikke være tom");
    }
    this.title = title;
    this.borrowed = false; // Et nyt eksemplar er ledigt
    this.borrowCount = 0;
  }

  public String getTitle()
  {
    return title;
  }

  public boolean borrow()
  {
    if (borrowed)
    {
      return false;
    }
    borrowed = true;
    borrowCount++;
    return true;
  }

  public boolean returnBook()
  {
    if (!borrowed)
    {
      return false;
    }
    borrowed = false;
    return true;
  }

  public boolean isBorrowed()
  {
    return borrowed;
  }
  public int getBorrowCount() {
    return borrowCount;
  }
}
