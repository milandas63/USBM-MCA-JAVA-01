package com.day06;

public class Stretch {
	public String stretch(String data, int len, char side, char used) {
		StringBuffer buf = new StringBuffer(data);
		for(int i=buf.length(); i<len; i++) {
			switch(side) {
			case 'L':
				buf.insert(0, used);
				break;
			case 'R':
				buf.append(used);
				break;
			case 'C':
				if(i%2==0) {
					buf.insert(0, used);
				} else {
					buf.append(used);
				}
				break;
			}
		}
		
		return buf.toString();	
	}

	public String padLeft(String data, int len) {
		return stretch(data, len, 'L', ' ');
	}
	public String padLeft(String data, int len,char used) {
		return stretch(data, len, 'L', used);
	}

	public String padRight(String data, int len) {
		return stretch(data, len, 'R', ' ');
	}
	public String padRight(String data, int len, char used) {
		return stretch(data, len, 'R', used);
	}

	public String padCenter(String data, int len) {
		return stretch(data, len, 'C', ' ');
	}
	public String padCenter(String data, int len, char used) {
		return stretch(data, len, 'C', used);
	}

	public String justifyLeft(String data, int len) {
		return stretch(data, len, 'R', ' ');
	}
	public String justifyLeft(String data, int len,char used) {
		return stretch(data, len, 'R', used);
	}

	public String justifyRight(String data, int len) {
		return stretch(data, len, 'L', ' ');
	}
	public String justifyRight(String data, int len, char used) {
		return stretch(data, len, 'L', used);
	}

	public String justifyCenter(String data, int len) {
		return stretch(data, len, 'C', ' ');
	}
	public String justifyCenter(String data, int len, char used) {
		return stretch(data, len, 'C', used);
	}

}
