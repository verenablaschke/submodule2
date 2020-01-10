package de.tuebingen.sfs.additionalsubmodule;

import de.tuebingen.sfs.submodulefromroot.SubmoduleFromRoot;

public class Submodule2 {

	public static void main(String[] args) {
		greet();
		SubmoduleFromRoot.greet();
	}

	public static void greet() {
		System.out.println("Submodule2");
	}
}
