# This file was auto-generated by Fern from our API Definition.

from __future__ import annotations

import typing

import pydantic
from ...core.pydantic_utilities import IS_PYDANTIC_V2, UniversalBaseModel, update_forward_refs
from .test_case import TestCase


class TestCaseWithExpectedResult(UniversalBaseModel):
    test_case: TestCase = pydantic.Field(alias="testCase")
    expected_result: "VariableValue" = pydantic.Field(alias="expectedResult")

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow")  # type: ignore # Pydantic v2
    else:

        class Config:
            extra = pydantic.Extra.allow


from .key_value_pair import KeyValuePair  # noqa: E402, F401, I001
from .map_value import MapValue  # noqa: E402, F401, I001
from .variable_value import VariableValue  # noqa: E402, F401, I001

update_forward_refs(TestCaseWithExpectedResult)
