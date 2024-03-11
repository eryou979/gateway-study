package org.example.service.exception;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalControllerAdvice {
    @ExceptionHandler(Exception.class)
    public Object handleException(Exception ex) {
        log.error("系统错误", ex);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(JSONUtil.createObj()
                .set("status", "error")
                .set("error", ex.getMessage()));
    }

}
