public class BookCopy
{
  private final String title;
  private boolean borrowed;

  public BookCopy(String title)
  {
    if (title == null || title.isBlank())
    {
      throw new IllegalArgumentException("Titel må ikke være tom");
    }
    this.title = title;
    this.borrowed = false; // Et nyt eksemplar er ledigt
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
    return true;
  }

  public void returnBook()
  {
    borrowed = false;
  }

  public boolean isBorrowed()
  {
    return borrowed;
  }
}

