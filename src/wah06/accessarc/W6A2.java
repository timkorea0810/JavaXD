package wah06.accessarc;

import wah06.pacman.MemberVO;

public class W6A2 {
	
	public static void main(String[] args) {
		
		MemberVO memberVO = new MemberVO();
		memberVO.setId("pika");		
		memberVO.setPassword("pika1234");		
		memberVO.setName("피카츄");		
		memberVO.setPhoneNumber("010-1234-5678");		
		memberVO.setAddress("서울시 서대문구 신촌동");			
		
		String id = memberVO.getId();
		String password = memberVO.getPassword();
		String name = memberVO.getName();
		String phoneNumber = memberVO.getPhoneNumber();
		String address = memberVO.getAddress();
		
		System.out.println(id);
		System.out.println("****");
		System.out.println(name);
		System.out.println(phoneNumber);
		System.out.println(address);
		
	}
	
}
