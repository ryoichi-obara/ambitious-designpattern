package jp.ktsystem.ambitious.designpattern.visitor.sample.filesystem.factory;

import jp.ktsystem.ambitious.designpattern.visitor.sample.filesystem.File;
import jp.ktsystem.ambitious.designpattern.visitor.sample.filesystem.Folder;

/**
 * <h1>Create CDrive composite data.</h1>
 *
 * @author ryoichi0102
 * @since 2013/05/23
 */
public class SampleCDriveFactory {

	private static final SampleCDriveFactory instance = new SampleCDriveFactory();

	private SampleCDriveFactory() {}

	public static SampleCDriveFactory getInstance() {
		return instance;
	}

	/**
	 * Get sample C drive data.<br>
	 *
	 * @return Folder
	 */
	public Folder getSample() {

		return new Folder("/", 777)
			.addSubFolder(createProgramFiles())
			.addSubFolder(createUsers())
			.addSubFolder(createWindows())
			.addFile(new File("autoexec.bat", 777, ""))
			.addFile(new File("config.sys", 777, ""));
	}

	// private

	private Folder createProgramFiles() {
		return new Folder("Program Files", 777)
			.addSubFolder(new Folder("Microsoft Office", 777)
			                  .addFile(new File("excel.exe", 777, ""))
			                  .addFile(new File("word.exe", 777, ""))
			.addSubFolder(new Folder("", 777)));
	}

	private Folder createUsers() {
		return new Folder("Users", 777)
			.addSubFolder(createUser("shibata"))
			.addSubFolder(createUser("kawamura"))
			.addSubFolder(createUser("ogawa"))
			.addSubFolder(createUser("ueno"))
			.addSubFolder(createUser("kimura"))
			.addSubFolder(createUser("sakai"))
			.addSubFolder(createUser("saikawa"))
			.addSubFolder(createUser("yamaguchi"))
			.addSubFolder(createUser("maruyama"))
			.addSubFolder(createUser("obara"));
	}

	private Folder createUser(String username) {
		return new Folder(username, 777)
			.addSubFolder(new Folder("My document", 777))
			.addSubFolder(new Folder("Desktop", 777))
			.addSubFolder(new Folder("Start menu", 777));
	}

	private Folder createWindows() {
		return new Folder("Windows", 777)
			.addSubFolder(new Folder("System", 777))
			.addSubFolder(new Folder("System32", 777))
			.addFile(new File("win.ini", 777, ""));
	}

}
