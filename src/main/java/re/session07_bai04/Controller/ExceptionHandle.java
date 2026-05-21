package re.session07_bai04.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import re.session07_bai04.Exception.NotFoundException;
import re.session07_bai04.Exception.Error;

@RestControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Error> handleResourceNotFound(NotFoundException ex) {
        Error errorResponse = new Error(404, "Không tìm thấy");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }
}
