package jp.ktsystem.ambitious.designpattern.visitor;

import jp.ktsystem.ambitious.designpattern.visitor.sample.filesystem.FileSearchVisitor;
import jp.ktsystem.ambitious.designpattern.visitor.sample.filesystem.Folder;
import jp.ktsystem.ambitious.designpattern.visitor.sample.filesystem.factory.SampleCDriveFactory;

public class Main {

	public static void main(String[] args) {

		Folder f = SampleCDriveFactory.getInstance().getSample();

		FileSearchVisitor visitor = new FileSearchVisitor();

		f.accept(visitor);

		visitor.getResult();
		
		
	}

}
