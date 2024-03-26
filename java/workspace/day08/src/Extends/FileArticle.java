package Extends;

public class FileArticle extends  Article{
	
	private String FileName;
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	@Override
	public String toString() {
		return "FileArticle [번호=" + getNum()
				+ ", 제목=" + getTitle()
				+ ", FileName=" + FileName + "]";
	}
}
