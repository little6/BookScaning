package com.scanbook.bean;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/**
 *
 */
public class BookInfo implements Parcelable {
	//图书ID
	private String id;
    //图书标题
	private String Title;	
	//图书作者
    private String Author;
    //作者信息
    private String AuthorInfo;
    //图书出版社
    private String Publisher;
    //出版时间
    private String PublishDate;
    //图书ISBN码
    private String ISBN;
    //图书价格
    private String Price;
    //图书页数
    private String Page;
    //图书评分
    private String Rate;
    //图书标签
    private String Tag;
    //图书目录
    private String Content;
    //图书摘要
    private String Summary;
    //图书图片
    private Bitmap Bitmap;



	public static Parcelable.Creator<BookInfo> getCreator() {
		return CREATOR;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getAuthorInfo() {
		return AuthorInfo;
	}
	public void setAuthorInfo(String authorInfo) {
		AuthorInfo = authorInfo;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public String getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(String publishDate) {
		PublishDate = publishDate;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getPage() {
		return Page;
	}
	public void setPage(String page) {
		Page = page;
	}
	public String getRate() {
		return Rate;
	}
	public void setRate(String rate) {
		Rate = rate;
	}
	public String getTag() {
		return Tag;
	}
	public void setTag(String tag) {
		Tag = tag;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getSummary() {
		return Summary;
	}
	public void setSummary(String summary) {
		Summary = summary;
	}
	public Bitmap getBitmap() {
		return Bitmap;
	}
	public void setBitmap(Bitmap bitmap) {
		Bitmap = bitmap;
	}
	public static void setCreator(Parcelable.Creator<BookInfo> creator) {
		CREATOR = creator;
	}
	public static Parcelable.Creator<BookInfo> CREATOR = new Creator<BookInfo>() {
        public BookInfo createFromParcel(Parcel source) {
            BookInfo bookInfo = new BookInfo();
            bookInfo.Title = source.readString();
            bookInfo.Bitmap = source.readParcelable(Bitmap.class.getClassLoader());
            bookInfo.Author = source.readString();
            bookInfo.Publisher = source.readString();
            bookInfo.PublishDate = source.readString();
            bookInfo.ISBN = source.readString();
            bookInfo.Summary = source.readString();
            bookInfo.id=source.readString();;
            bookInfo.AuthorInfo=source.readString();
            bookInfo.Page=source.readString();
            bookInfo.Price=source.readString();;
            bookInfo.Rate=source.readString();
            bookInfo.Tag=source.readString();
            bookInfo.Content=source.readString();
            return bookInfo;
        }
        public BookInfo[] newArray(int size) {
            return new BookInfo[size];
        }
    };
    public int describeContents() {
        return 0;
    }
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Title);
        dest.writeParcelable(Bitmap, flags);
        dest.writeString(Author);
        dest.writeString(Publisher);
        dest.writeString(PublishDate);
        dest.writeString(ISBN);
        dest.writeString(Summary);
        dest.writeString(id);
        dest.writeString(AuthorInfo);
        dest.writeString(Page);
        dest.writeString(Price);
        dest.writeString(Rate);
        dest.writeString(Tag);
        dest.writeString(Content);
    }

}
