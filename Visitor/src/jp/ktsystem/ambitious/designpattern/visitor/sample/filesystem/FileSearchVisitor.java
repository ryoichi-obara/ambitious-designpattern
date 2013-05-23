package jp.ktsystem.ambitious.designpattern.visitor.sample.filesystem;

import jp.ktsystem.ambitious.designpattern.visitor.sample.FilesystemVisitor;

public class FileSearchVisitor implements FilesystemVisitor {

	private File result;

	@Override
	public void visit(Folder element) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(File element) {
		// TODO Auto-generated method stub
	}

	// Getter

	public File getResult() {
		return result;
	}

}
