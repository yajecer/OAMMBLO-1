package com.fr4gus.android.oammblo.bo;

import java.util.Date;

public class Tweet {
	private User author;
	private String content;
	private Date datetime;

	public Tweet(User author, String content, Date datetime) {
		super();
		this.author = author;
		this.content = content;
		this.datetime = datetime;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	@Override
	public String toString() {
		return "Tweet [author=" + author + ", content=" + content
				+ ", datetime=" + datetime + "]";
	}

}
