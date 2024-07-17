package com.ty.jenkins.jenkins_example.responseStructureMethod;


import com.ty.jenkins.jenkins_example.entity.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ApiResponseMethod {



    public static ResponseEntity<ApiResponse> createObject(Object object){
        ApiResponse apiResponse=new ApiResponse();
       apiResponse.setData(object);
       apiResponse.setHttpStatus(HttpStatus.CREATED);
       apiResponse.setHttpStatusCode(HttpStatus.CREATED.value());

            return new  ResponseEntity<ApiResponse>(apiResponse,HttpStatus.CREATED);
    }

    public static ResponseEntity<ApiResponse> getObject(Object object){

        ApiResponse apiResponse=new ApiResponse();
        apiResponse.setData(object);
        apiResponse.setHttpStatus(HttpStatus.OK);
        apiResponse.setHttpStatusCode(HttpStatus.OK.value());

        return new  ResponseEntity<ApiResponse>(apiResponse,HttpStatus.OK);
    }

    public static ResponseEntity<ApiResponse> updateObject(Object object){

        ApiResponse apiResponse=new ApiResponse();
        apiResponse.setData(object);
        apiResponse.setHttpStatus(HttpStatus.ACCEPTED);
        apiResponse.setHttpStatusCode(HttpStatus.ACCEPTED.value());

        return new  ResponseEntity<ApiResponse>(apiResponse,HttpStatus.ACCEPTED);
    }

    public static ResponseEntity<ApiResponse> badRequest(Object object){

        ApiResponse apiResponse=new ApiResponse();
        apiResponse.setData(object);
        apiResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
        apiResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());

        return new  ResponseEntity<ApiResponse>(apiResponse,HttpStatus.BAD_REQUEST);
    }

    public static ResponseEntity<ApiResponse> notFound(Object object){

        ApiResponse apiResponse=new ApiResponse();
        apiResponse.setData(object);
        apiResponse.setHttpStatus(HttpStatus.NOT_FOUND);
        apiResponse.setHttpStatusCode(HttpStatus.NOT_FOUND.value());

        return new  ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
    }

    public static ResponseEntity<ApiResponse> found(Object object){

        ApiResponse apiResponse=new ApiResponse();
        apiResponse.setData(object);
        apiResponse.setHttpStatus(HttpStatus.FOUND);
        apiResponse.setHttpStatusCode(HttpStatus.FOUND.value());

        return new  ResponseEntity<ApiResponse>(apiResponse,HttpStatus.FOUND);
    }
}
