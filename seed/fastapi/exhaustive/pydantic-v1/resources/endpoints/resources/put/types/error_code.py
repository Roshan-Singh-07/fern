# This file was auto-generated by Fern from our API Definition.

import enum
import typing
T_Result = typing.TypeVar("T_Result")
class ErrorCode(str, enum.Enum):
    INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR"
    UNAUTHORIZED = "UNAUTHORIZED"
    FORBIDDEN = "FORBIDDEN"
    BAD_REQUEST = "BAD_REQUEST"
    CONFLICT = "CONFLICT"
    GONE = "GONE"
    UNPROCESSABLE_ENTITY = "UNPROCESSABLE_ENTITY"
    NOT_IMPLEMENTED = "NOT_IMPLEMENTED"
    BAD_GATEWAY = "BAD_GATEWAY"
    SERVICE_UNAVAILABLE = "SERVICE_UNAVAILABLE"
    UNKNOWN = "Unknown"
    
    def visit(self, internal_server_error: typing.Callable[[], T_Result], unauthorized: typing.Callable[[], T_Result], forbidden: typing.Callable[[], T_Result], bad_request: typing.Callable[[], T_Result], conflict: typing.Callable[[], T_Result], gone: typing.Callable[[], T_Result], unprocessable_entity: typing.Callable[[], T_Result], not_implemented: typing.Callable[[], T_Result], bad_gateway: typing.Callable[[], T_Result], service_unavailable: typing.Callable[[], T_Result], unknown: typing.Callable[[], T_Result]) -> T_Result:
        if self is ErrorCode.INTERNAL_SERVER_ERROR:
            return internal_server_error(
            )
        if self is ErrorCode.UNAUTHORIZED:
            return unauthorized(
            )
        if self is ErrorCode.FORBIDDEN:
            return forbidden(
            )
        if self is ErrorCode.BAD_REQUEST:
            return bad_request(
            )
        if self is ErrorCode.CONFLICT:
            return conflict(
            )
        if self is ErrorCode.GONE:
            return gone(
            )
        if self is ErrorCode.UNPROCESSABLE_ENTITY:
            return unprocessable_entity(
            )
        if self is ErrorCode.NOT_IMPLEMENTED:
            return not_implemented(
            )
        if self is ErrorCode.BAD_GATEWAY:
            return bad_gateway(
            )
        if self is ErrorCode.SERVICE_UNAVAILABLE:
            return service_unavailable(
            )
        if self is ErrorCode.UNKNOWN:
            return unknown(
            )
