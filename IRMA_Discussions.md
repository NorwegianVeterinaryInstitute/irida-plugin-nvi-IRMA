### 17 Oct 2025

Example used
```
IRMA FLU data/sequence/21331/2/251010_M09180.XXXXXXXX_R1_001.fastq /opt/irida/data/sequence/21332/2/251010_M09180.XXXXXXXX_S18_R2_001.fastq resultDir
```

Get about 10 smaples (woth good/ok/bad variations) from cathrine and run in commandline with the options we discussed here. 

#### Deletion situation 
- Using module FLU is fine
  - FHI is also using FLU module/config
  - Align last deletion type DEL so we know exactly what happened. NNNN can represent so many stuffs and mislaead us
  - DEL_TYPE=DEL
    
- MIN_CONS_SUPPORT=10 - We need to test this
- PADDED_CONSENSUS=1
- MIN_CONS_SUPPORT=10
- MIN_CONS_QUALITY=10

# Wait until the the decision on INSERTION

#### Insertion situation - by default it wont care about insertion 
- Are we gonna use insertion information in the sequence if its there
- INS_T
- INS_T_DEPTH
