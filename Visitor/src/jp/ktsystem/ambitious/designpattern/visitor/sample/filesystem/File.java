package jp.ktsystem.ambitious.designpattern.visitor.sample.filesystem;

import java.util.Date;

import jp.ktsystem.ambitious.designpattern.visitor.sample.FilesystemElement;
import jp.ktsystem.ambitious.designpattern.visitor.sample.FilesystemVisitor;

/**
 * <h1>File as composite.<h1>
 *
 * @author ryoichi0102
 * @since 2013/05/23
 */
public class File implements FilesystemElement {

	private String name;
	private Date created;
	private Date modified;
	private int permission; // owner, group, everyone

	private String content;

	/**
	 * Constructor.<br>
	 *
	 * @param name
	 * @param permission 3 digits int.
	 *                   A digit means permission to access the file.
	 *                       +4 Reading permission
	 *                       +2 Writing permission
	 *                       +1 Executing permission 
	 *                   ex.
	 *                       People has 7 can read, write and execute.
	 *                       People has 6 can read and write. 
	 *                       People has 5 can read and execute.
	 *                   Each digit means role below.
	 *                       Hundreds digit : Owner
	 *                       Tenths digit : Group
	 *                       Unit digit : Everyone
	 *                   ex.
	 *                       Permission 444 means Owner, Group, Everyone can read.
	 *                       Permission 740 means
	 *                           Owner can read, write and execute,
	 *                           Group can read,
	 *                           Everyone can do nothing.
	 * @param content
	 */
	public File(String name, int permission, String content) {
		this.name = name;
		this.permission = permission;
		this.content = content;

		this.created = new Date();
		this.modified = this.created;
	}

	// public

	/**
	 * Element#accept visits Visitor.<br>
	 *
	 * @param visitor FilesystemVisitor
	 */
	@Override
	public void accept(FilesystemVisitor visitor) {
		visitor.visit(this);
	};


	public void changeName(String newName) {
		this.name = newName;
		reflesh();
	}

	public void changePermission(int newPermission) {
		this.permission = newPermission;
		reflesh();
	}

	public void changeContent(String newContent) {
		this.content = newContent;
	}

	public void reflesh() {
		this.modified = new Date();
	}
	// getter

	public String getName() {
		return name;
	}
	public Date getCreated() {
		return created;
	}
	public Date getModified() {
		return modified;
	}
	public int getPermission() {
		return permission;
	}
	public String getContent() {
		return content;
	}

}
