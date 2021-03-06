/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.tools.idea.gradle;

import com.android.ide.common.repository.GradleVersion;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Tests for {@link GradleModelFeatures}.
 */
public class GradleModelFeaturesTest {
  @Test
  public void withoutPluginVersion() {
    GradleModelFeatures features = new GradleModelFeatures(null);
    assertFalse(features.isIssueReportingSupported());
    assertFalse(features.isShadersSupported());
    assertFalse(features.isDependencyGraphSupported());
    assertFalse(features.isTestedTargetVariantsSupported());
    assertFalse(features.isProductFlavorVersionSuffixSupported());
    assertFalse(features.isExternalBuildSupported());
    assertFalse(features.isConstraintLayoutSdkLocationSupported());
  }

  @Test
  public void withPluginVersion1_0_0() {
    GradleVersion version = GradleVersion.parse("1.0.0");
    GradleModelFeatures features = new GradleModelFeatures(version);
    assertFalse(features.isIssueReportingSupported());
    assertFalse(features.isShadersSupported());
    assertFalse(features.isDependencyGraphSupported());
    assertFalse(features.isTestedTargetVariantsSupported());
    assertFalse(features.isProductFlavorVersionSuffixSupported());
    assertFalse(features.isExternalBuildSupported());
    assertFalse(features.isConstraintLayoutSdkLocationSupported());
  }

  @Test
  public void withPluginVersion1_1_0() {
    GradleVersion version = GradleVersion.parse("1.1.0");
    GradleModelFeatures features = new GradleModelFeatures(version);
    assertTrue(features.isIssueReportingSupported());
    assertFalse(features.isShadersSupported());
    assertFalse(features.isDependencyGraphSupported());
    assertFalse(features.isTestedTargetVariantsSupported());
    assertFalse(features.isProductFlavorVersionSuffixSupported());
    assertFalse(features.isExternalBuildSupported());
    assertFalse(features.isConstraintLayoutSdkLocationSupported());
  }

  @Test
  public void withPluginVersion2_1_0() {
    GradleVersion version = GradleVersion.parse("2.1.0");
    GradleModelFeatures features = new GradleModelFeatures(version);
    assertTrue(features.isIssueReportingSupported());
    assertTrue(features.isShadersSupported());
    assertFalse(features.isDependencyGraphSupported());
    assertFalse(features.isTestedTargetVariantsSupported());
    assertFalse(features.isProductFlavorVersionSuffixSupported());
    assertFalse(features.isExternalBuildSupported());
    assertFalse(features.isConstraintLayoutSdkLocationSupported());
  }

  @Test
  public void withPluginVersion2_2_0() {
    GradleVersion version = GradleVersion.parse("2.2.0");
    GradleModelFeatures features = new GradleModelFeatures(version);
    assertTrue(features.isIssueReportingSupported());
    assertTrue(features.isShadersSupported());
    //assertTrue(features.isDependencyGraphSupported());
    assertTrue(features.isTestedTargetVariantsSupported());
    assertTrue(features.isProductFlavorVersionSuffixSupported());
    assertTrue(features.isExternalBuildSupported());
    assertTrue(features.isConstraintLayoutSdkLocationSupported());
  }
}