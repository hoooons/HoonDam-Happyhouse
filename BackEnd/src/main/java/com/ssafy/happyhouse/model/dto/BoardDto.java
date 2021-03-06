package com.ssafy.happyhouse.model.dto;
import java.sql.Timestamp;
public class BoardDto {
	private int id;
    private String title;
    private String writer;
    private String content;
    private Timestamp boarddate;
    private String key;
    private String word;

    public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public void setId(int id) { 
        this.id = id;
    }

    public int getId() { 
        return id;
    }

    public void setTitle(String title) { 
        this.title = title;
    }

    public String getTitle() { 
        return title;
    }

    public void setWriter(String writer) { 
        this.writer = writer;
    }

    public String getWriter() { 
        return writer;
    }

    public void setContent(String content) { 
        this.content = content;
    }

    public String getContent() { 
        return content;
    }

    public void setBoarddate(Timestamp boarddate) { 
        this.boarddate = boarddate;
    }

    public Timestamp getBoarddate() { 
        return boarddate;
    }

}