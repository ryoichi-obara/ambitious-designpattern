package jp.ktsystem.ambitious.designpattern.visitor.sample;

/**
 * <h1>Acceptor (Element).</h1>
 *
 * @author ryoichi0102
 * @since 2013/05/23
 */
public interface FilesystemElement {

	public void accept(FilesystemVisitor visitor);

}
