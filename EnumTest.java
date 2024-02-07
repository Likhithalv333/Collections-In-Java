package com.sathya.collectinslabqestions;
enum HttpStatus{
	OK(200),CREATE(201),BAD_REQUEST(400),NOT_FOUND(404),INTTERNAL_SERVER_ERROR(500);
		private final int code;
	HttpStatus(int code) {
		this.code = code;
		// TODO Auto-generated constructor stub
	}
	public int getCode() {
		return code;
		
	}
}
class EnumTest {

	
		// TODO Auto-generated method stub
		static HttpStatus yourEquestHandle() {
			return HttpStatus.OK;
		}
		static void handleResponseStatus(HttpStatus status) {
			switch(status) {
			case OK:
				System.out.println("request was successful.."+status.getCode());
				break;
			case NOT_FOUND:
				System.out.println("resource not found...");
				break;
			case INTTERNAL_SERVER_ERROR:
				System.out.println("internal server error occurred...");
				break;
			default:
				System.out.println("unhandled status");
			}
		}
	}

class Test{
	public static void main(String[] args) {
	HttpStatus responseStatus = EnumTest.yourEquestHandle();
	EnumTest.handleResponseStatus(responseStatus);
	
	}
}
