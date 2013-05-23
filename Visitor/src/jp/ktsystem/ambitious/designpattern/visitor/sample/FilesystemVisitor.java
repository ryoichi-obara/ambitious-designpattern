package jp.ktsystem.ambitious.designpattern.visitor.sample;

import jp.ktsystem.ambitious.designpattern.visitor.sample.filesystem.File;
import jp.ktsystem.ambitious.designpattern.visitor.sample.filesystem.Folder;

public interface FilesystemVisitor {

	public void visit(File element);
	public void visit(Folder element);

}
