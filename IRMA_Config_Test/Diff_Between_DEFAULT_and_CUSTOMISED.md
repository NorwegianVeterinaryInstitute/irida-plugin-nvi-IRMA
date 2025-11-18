```
 diff  2025-07-2990-4-1/logs/FLU-output_2.sh output_2/logs/FLU-output_2.sh  --unified=0
```

```
--- 2025-07-2990-4-1/logs/FLU-output_2.sh	2025-10-31 15:18:33
+++ output_2/logs/FLU-output_2.sh	2025-11-17 10:13:44
@@ -28 +28 @@
-SKIP_E=0		# skip reference elongation
+SKIP_E=1		# skip reference elongation
@@ -45,2 +45,2 @@
-DO_SECONDARY=1		# do secondary assembly
-RESIDUAL_ASSEMBLY_FACTOR=400	# the primary match to alternative match (secondary) ratio limit. If less than this number, do the residual.
+DO_SECONDARY=0		# do secondary assembly
+RESIDUAL_ASSEMBLY_FACTOR=0	# the primary match to alternative match (secondary) ratio limit. If less than this number, do the residual.
@@ -68 +68 @@
-DEL_TYPE="DEL"	# rough assembly deletion handling: NNN, REF, or DEL
+DEL_TYPE=""	# rough assembly deletion handling: NNN, REF, or DEL
@@ -89,2 +89,2 @@
-MIN_CONS_SUPPORT=10	# minimum consensus support for amended consensus
-MIN_CONS_QUALITY=10	# minimum consensus average quality for amended consensus
+MIN_CONS_SUPPORT=1	# minimum consensus support for amended consensus
+MIN_CONS_QUALITY=0	# minimum consensus average quality for amended consensus
@@ -92 +92 @@
-PADDED_CONSENSUS=1	# attempt to pad amended_consensus with Ns for amplicaton dropout: requires ALIGN_AMENDED=1 and ASSEM_REF=1
+PADDED_CONSENSUS=0	# attempt to pad amended_consensus with Ns for amplicaton dropout: requires ALIGN_AMENDED=1 and ASSEM_REF=1
```
