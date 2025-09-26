# Bazel Binary for FuzzApkTool

This directory contains a **prebuilt Bazel binary** required to build the `FuzzApkTool` branch of Jazzer.

---

## Why is this needed?

The `FuzzApkTool` branch depends on a **specific Bazel version** that is not available through regular package managers.  
Other Bazel versions fail to build due to incompatibilities with the `WORKSPACE` configuration and build rules.  

To address this, we provide the **exact Bazel binary** known to work with this PoC.

---

## Usage

To use this binary, place it inside the following directory so that Bazel will treat it as the default:

```bash
sudo cp tools_bazel/bazel /usr/local/bin/
