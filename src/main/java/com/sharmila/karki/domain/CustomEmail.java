package com.sharmila.karki.domain;

public class CustomEmail {

	private String id;
	private String subject; 
	private String content;
	private String to;
	private String from;
	private String attachment;
	private String response;

	public CustomEmail() {
		super();
	}

	public CustomEmail(Builder builder) {
		this.subject=builder.subject;
		this.content=builder.content;
		this.to=builder.to;
		this.from=builder.from;
		this.attachment=builder.attachment;
	}
		
	public CustomEmail(String id, String subject, String content, String to, String from, String attachment) {
		super();
		this.id = id;
		this.subject = subject;
		this.content = content;
		this.to = to;
		this.from = from;
		this.attachment = attachment;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public static class Builder{
		private String subject; 
		private String content;
		private String to;
		private String from;
		private String attachment;
		private String response;

		
		public Builder subject(String subject){
			this.subject=subject;
			return this;
		}

		public Builder content(String content){
			this.content=subject;
			return this;
		}

		public Builder to(String to){
			this.to=to;
			return this;
		}

		public Builder from(String from){
			this.from=from;
			return this;
		}
		
		public Builder attachment(String attachment){
			this.attachment=attachment;
			return this;
		}
		public Builder response(String response){
			this.response=response;
			return this;
		}
		public CustomEmail build(){
			return new CustomEmail(this);
		}
	}
	
}
