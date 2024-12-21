package com.example.demo;

public class Note {
	private String title;
	private String page;
	private String note;
	
	public Note() {
		
	}
	
	public Note(String title, String page, String note) {
		this.title = title;
		this.page = page;
		this.note = note;
	}
	
	public String getTitle() {
		return this.title;
	}
	public String getPage() {
		return this.page;
	}
	public String getNote() {
		return this.note;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public void setNote(String note) {
		this.note = note;
	}
}