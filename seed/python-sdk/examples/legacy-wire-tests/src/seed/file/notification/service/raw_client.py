# This file was auto-generated by Fern from our API Definition.

from ....core.client_wrapper import SyncClientWrapper
import typing
from ....core.request_options import RequestOptions
from ....core.http_response import HttpResponse
from ....types.types.exception import Exception
from ....core.jsonable_encoder import jsonable_encoder
from ....core.pydantic_utilities import parse_obj_as
from json.decoder import JSONDecodeError
from ....core.api_error import ApiError
from ....core.client_wrapper import AsyncClientWrapper
from ....core.http_response import AsyncHttpResponse
class RawServiceClient:
    def __init__(self, *, client_wrapper: SyncClientWrapper):
        self._client_wrapper = client_wrapper
    
    def get_exception(self, notification_id: str, *, request_options: typing.Optional[RequestOptions] = None) -> HttpResponse[Exception]:
        """
        Parameters
        ----------
        notification_id : str
        
        request_options : typing.Optional[RequestOptions]
            Request-specific configuration.
        
        Returns
        -------
        HttpResponse[Exception]
        """
        _response = self._client_wrapper.httpx_client.request(
            f"file/notification/{jsonable_encoder(notification_id)}",method="GET",
            request_options=request_options,)
        try:
            if 200 <= _response.status_code < 300:
                _data = typing.cast(
                    Exception,
                    parse_obj_as(
                        type_ =Exception,  # type: ignore
                        object_ =_response.json()
                    )
                )
                return HttpResponse(response=_response, data=_data)
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, headers=dict(_response.headers), body=_response.text)
        raise ApiError(status_code=_response.status_code, headers=dict(_response.headers), body=_response_json)
class AsyncRawServiceClient:
    def __init__(self, *, client_wrapper: AsyncClientWrapper):
        self._client_wrapper = client_wrapper
    
    async def get_exception(self, notification_id: str, *, request_options: typing.Optional[RequestOptions] = None) -> AsyncHttpResponse[Exception]:
        """
        Parameters
        ----------
        notification_id : str
        
        request_options : typing.Optional[RequestOptions]
            Request-specific configuration.
        
        Returns
        -------
        AsyncHttpResponse[Exception]
        """
        _response = await self._client_wrapper.httpx_client.request(
            f"file/notification/{jsonable_encoder(notification_id)}",method="GET",
            request_options=request_options,)
        try:
            if 200 <= _response.status_code < 300:
                _data = typing.cast(
                    Exception,
                    parse_obj_as(
                        type_ =Exception,  # type: ignore
                        object_ =_response.json()
                    )
                )
                return AsyncHttpResponse(response=_response, data=_data)
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, headers=dict(_response.headers), body=_response.text)
        raise ApiError(status_code=_response.status_code, headers=dict(_response.headers), body=_response_json)
