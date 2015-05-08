/*
 * Copyright (C) 2015 The Android Open Source Project
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
package com.android.tools.idea.structure.developerServices;

import org.jetbrains.annotations.NotNull;

/**
 * The valid list of categories a developer service can be a part of.
 */
public enum ServiceCategory {

  Ads,
  Analytics,
  Authentication,
  GameServices("Game Services"),
  GeoLocation("Geo/Location"),
  Localization,
  Payments,
  Publishing;

  @NotNull
  private final String myDisplayName;

  ServiceCategory() {
    myDisplayName = name();
  }

  ServiceCategory(@NotNull final String displayName) {
    myDisplayName = displayName;
  }

  @NotNull
  public String getDisplayName() {
    return myDisplayName;
  }
}