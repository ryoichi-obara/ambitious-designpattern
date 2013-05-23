package jp.ktsystem.ambitious.designpattern.visitor.sample.filesystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jp.ktsystem.ambitious.designpattern.visitor.sample.FilesystemElement;
import jp.ktsystem.ambitious.designpattern.visitor.sample.FilesystemVisitor;

/**
 * <h1>Folder as composite.</h1>
 *
 * @author ryoichi0102
 * @since 2013/05/23
 */
public class Folder implements FilesystemElement {

	private List<Folder> subFolders;
	private List<File> files;

	private String name;
	private Date created;
	private Date modified;
	private int permission;

	// constructor

	public Folder(String name, int permission) {
		this(name, permission, new ArrayList<Folder>(), new ArrayList<File>());
	}

	public Folder(String name, int permission, List<Folder> subFolders, List<File> files) {
		if (null == subFolders) {
			this.subFolders = new ArrayList<Folder>();
		} else {
			this.subFolders = subFolders;
		}
		if (null == files) {
			this.files = new ArrayList<File>();
		} else {
			this.files = files;
		}

		this.name = name;
		this.permission = permission;
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
	}


	public Folder addSubFolder(Folder folder) {
		// TODO Cannot create subFolder which has the same folder name.
		this.subFolders.add(folder);
		reflesh();
		return this;
	}
	public Folder removeFolder(Folder folder) {
		this.subFolders.remove(folder);
		reflesh();
		return this;
	}

	public Folder addFile(File file) {
		// TODO Cannot create file which has the same file name.
		this.files.add(file);
		reflesh();
		return this;
	}
	public Folder removeFile(File file) {
		this.files.remove(file);
		reflesh();
		return this;
	}

	public void changeName(String newName) {
		this.name = newName;
		reflesh();
	}

	public void changePermission(int newPermission) {
		this.permission = newPermission;
		reflesh();
	}

	public void reflesh() {
		this.modified = new Date();
	}
	// getter

	public List<Folder> getSubFolders() {
		return subFolders;
	}
	public List<File> getFiles() {
		return files;
	}
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

}
