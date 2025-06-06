# This file was auto-generated by Fern from our API Definition.

from __future__ import annotations

import typing

from .......core.pydantic_utilities import UniversalBaseModel
from .parameter_id import ParameterId


class TestCaseImplementationDescriptionBoard_Html(UniversalBaseModel):
    value: str
    type: typing.Literal["html"] = "html"


class TestCaseImplementationDescriptionBoard_ParamId(UniversalBaseModel):
    value: ParameterId
    type: typing.Literal["paramId"] = "paramId"


TestCaseImplementationDescriptionBoard = typing.Union[
    TestCaseImplementationDescriptionBoard_Html, TestCaseImplementationDescriptionBoard_ParamId
]
